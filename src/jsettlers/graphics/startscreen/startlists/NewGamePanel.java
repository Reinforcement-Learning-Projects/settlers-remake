package jsettlers.graphics.startscreen.startlists;

import jsettlers.graphics.action.Action;
import jsettlers.graphics.action.ExecutableAction;
import jsettlers.graphics.startscreen.IContentSetable;
import jsettlers.graphics.startscreen.interfaces.IStartScreen;
import jsettlers.graphics.startscreen.interfaces.IStartableMapDefinition;
import jsettlers.graphics.startscreen.interfaces.IStartingGame;
import jsettlers.graphics.startscreen.progress.StartingGamePanel;
import jsettlers.graphics.utils.UIListItem;

public class NewGamePanel extends StartListPanel<IStartableMapDefinition> {
	private final IStartScreen screen;
	private final IContentSetable contentSetable;

	public NewGamePanel(IStartScreen screen, IContentSetable contentSetable) {
		super(screen.getSingleplayerMaps());
		this.screen = screen;
		this.contentSetable = contentSetable;
	}

	@Override
	protected Action getSubmitAction() {
		return new ExecutableAction() {
			@Override
			public void execute() {
				IStartingGame game =
				        screen.startSingleplayerGame(getActiveListItem());
				contentSetable.setContent(new StartingGamePanel(game, contentSetable));
			}
		};
	}

	@Override
	public UIListItem getItem(IStartableMapDefinition item) {
		return new StartableMapListItem(item);
	}

}
