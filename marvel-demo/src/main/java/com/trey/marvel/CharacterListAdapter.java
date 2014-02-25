package com.trey.marvel;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.trey.marvel.model.api.vo.*;
import com.trey.marvel.model.api.vo.Character;

import java.util.List;

/**
 * Created by Trey Robinson on 2/24/14.
 */
public class CharacterListAdapter extends ArrayAdapter<com.trey.marvel.model.api.vo.Character>{
    

    private List<Character> data;

    public CharacterListAdapter(Context context, List<Character> data) {
        super(context, R.layout.generic_list_item);
        this.data = data;
    }
}
