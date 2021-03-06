//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : casino project
//  @ File Name : SFSGameReponse.java
//  @ Date : 5/27/2012
//  @ Author : sangdn
//
//



package casino.cardgame.message.reponse;

import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.data.ISFSArray;
import com.smartfoxserver.v2.entities.data.ISFSObject;
import com.smartfoxserver.v2.entities.data.SFSArray;
import com.smartfoxserver.v2.entities.data.SFSObject;
import java.util.ArrayList;
import java.util.List;


public abstract class SFSGameReponse implements casino.cardgame.message.IGameReponse {
    protected ISFSObject params;
    protected ArrayList<User> listReceiver;
    protected String m_name;
    public SFSGameReponse(String name){
        m_name = name;
        listReceiver = new ArrayList<User>();
        params = new SFSObject();
    }
    
    public ISFSObject GetParam(){
        return params;
    }
    //****************************************************************************************
    //          SFSGameReponse API
    //****************************************************************************************
    public SFSGameReponse AddReceiver(User user){
        listReceiver.add(user);
        return this;
    }
    public ArrayList<User> GetListReceiver(){
        return listReceiver;
    }
    //****************************************************************************************
    //          IMPLEMENT IGAMERESPONSE
    //****************************************************************************************
    @Override
    public String GetReponseName(){
        return m_name;
    }
    //********************** ADD PARAM TO SFSOBJECT PARAM ************************\\
    public SFSGameReponse AddParam(String key, int value){
        params.putInt(key, value);
        return this;
    }
    public SFSGameReponse AddParam(String key, String value){
        params.putUtfString(key, value);
        return this;
    }
    public SFSGameReponse AddParam(String key, boolean value){
        params.putBool(key, value);
        return this;
    }
    public SFSGameReponse AddParam(String key, Double value){
        params.putDouble(key, value);
        return this;
    }
    public SFSGameReponse AddParam(String key, ISFSArray value){
        params.putSFSArray(key, value);
        return this;
    }
    public SFSGameReponse AddParam(String key, ISFSObject value){
        params.putSFSObject(key, value);
        return this;
    }
    
    
}
