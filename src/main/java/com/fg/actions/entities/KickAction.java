package com.fg.actions.entities;

import com.fg.actions.PerformAction;
import com.fg.game.services.entities.Player;
import com.fg.utils.CommonUtils;

/**
 * Created by raheela on 01/02/2019.
 */
public class KickAction extends Action implements PerformAction {

    private static int coinsDeducted = 10;


    public KickAction(int id, String name) {
        super(id, name);
    }


    @Override
    public void execute(Player player, Action opponentAction) {
        if (!ActionName.KICK_BLOCK.equals(opponentAction.getName())) {
            deductCoins(player, coinsDeducted, opponentAction.getName());
        } else {
            CommonUtils.printMessage("WAOO!! no action is performed ");
        }
    }
}
