package com.whitepanda;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Ankit on 9/10/2016.
 */
public class SharedPreferenceManager {

    private static Context context;
    private static SharedPreferenceManager mInstance;
    private static final String PREF_NAME = "kMorePref";
    private static final String TAG = SharedPreferenceManager.class.getSimpleName();
    static SharedPreferences.Editor editor;
    static SharedPreferences preferences;
    int Mode = 0;
    Context _context;

    public SharedPreferenceManager(Context context) {
        this._context = context;
        preferences = context.getSharedPreferences(PREF_NAME, Mode);
        editor = preferences.edit();
    }

    public static SharedPreferenceManager getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SharedPreferenceManager(context);
        }
        return mInstance;
    }

    public void setLoginStatus(boolean status) {
        editor.putBoolean(Constants.LOGIN_PREF, status);
        editor.commit();
    }

    public boolean isLoggedIn() {
        return preferences.getBoolean(Constants.LOGIN_PREF, false);
    }

    public void setUserToken(String token) {
        editor.putString(Constants.TOKEN, token);
        editor.commit();
    }

    public String getUserToken() {
        return preferences.getString(Constants.TOKEN, "");
    }

    public void setUserEmail(String email) {
        editor.putString("email", email);
        editor.commit();
    }

    public String getUserEmail() {
        return preferences.getString("email", "");
    }

    public void setUserFullName(String fName) {
        editor.putString("userName", fName);
        editor.commit();
    }

    public String getUserName() {
        return preferences.getString("userName", "");
    }
}
