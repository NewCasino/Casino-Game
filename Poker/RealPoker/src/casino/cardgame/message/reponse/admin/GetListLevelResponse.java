//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : casino project
//  @ File Name : Notify_Start.java
//  @ Date : 6/7/2012
//  @ Author : sangdn
//  @ Description : send init cards for each player
//
//
package casino.cardgame.message.reponse.admin;

import casino.cardgame.entity.UserInfo;
import casino.cardgame.entity.game.TournamentEntity;
import casino.cardgame.message.reponse.game.poker.*;
import casino.cardgame.message.reponse.game.tala.*;
import com.smartfoxserver.v2.entities.data.ISFSArray;
import com.smartfoxserver.v2.entities.data.SFSArray;
import com.smartfoxserver.v2.entities.data.SFSObject;
import java.util.ArrayList;

public class GetListLevelResponse extends casino.cardgame.message.reponse.SFSGameReponse {

    private ISFSArray _arrLevel;
    
    public GetListLevelResponse() {
        super(ADMIN_RESPONSE_TYPE.GET_LIST_LEVEL_RES);
    }

    public SFSObject ToSFSObject() {
        SFSObject obj = new SFSObject();
        
        obj.putSFSArray("list_level", _arrLevel);
        return obj;
    }

    public void setArrLevel(ISFSArray arrLevel) {
        this._arrLevel = arrLevel;
    }
    
}