package jsettlers.logic.map.newGrid.partition.manager.manageables;

import jsettlers.common.material.EMaterialType;
import jsettlers.common.movable.EMovableType;
import jsettlers.common.position.ILocatable;
import jsettlers.common.position.ISPosition2D;
import jsettlers.logic.buildings.military.Barrack;

public interface IManageableBearer extends IManageable, ILocatable {

	void executeJob(ISPosition2D offer, ISPosition2D request, EMaterialType materialType);

	void becomeWorker(EMovableType movableType);

	void becomeWorker(EMovableType movableType, ISPosition2D offer);

	void becomeSoldier(Barrack barrack);

}
