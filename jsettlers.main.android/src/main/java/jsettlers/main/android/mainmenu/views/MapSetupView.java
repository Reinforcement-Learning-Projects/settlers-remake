package jsettlers.main.android.mainmenu.views;

import java.util.List;

import jsettlers.main.android.mainmenu.presenters.setup.Peacetime;
import jsettlers.main.android.mainmenu.presenters.setup.PlayerCount;
import jsettlers.main.android.mainmenu.presenters.setup.StartResources;
import jsettlers.main.android.mainmenu.presenters.setup.playeritem.PlayerSlotPresenter;

/**
 * Created by tompr on 22/01/2017.
 */

public interface MapSetupView {
	void setNumberOfPlayersOptions(PlayerCount[] playerCounts);

	void setStartResourcesOptions(StartResources[] startResources);

	void setPeaceTimeOptions(Peacetime[] peaceTimeOptions);

	void setMapName(String mapName);

	void setMapImage(short[] image);

	void setItems(List<PlayerSlotPresenter> items, int playerLimit);

	void setPlayerCount(PlayerCount playerCount);

	void setStartResources(StartResources item);
}
