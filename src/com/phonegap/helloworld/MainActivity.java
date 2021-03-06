/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.phonegap.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.apache.cordova.*;

public class MainActivity extends CordovaActivity implements View.OnClickListener
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View btnShopList = (Button) findViewById(R.id.buttonShoplist);
        btnShopList.setOnClickListener(this);

        View btnCategories = (Button) findViewById(R.id.buttonCategories);
        btnCategories.setOnClickListener(this);

        View btnWebview = (Button) findViewById(R.id.buttonWebview);
        btnWebview.setOnClickListener(this);

        // Set by <content src="index.html" /> in config.xml
    }


    @Override
    public void onClick(View v)
    {
        if(v.getId() == R.id.buttonShoplist)
        {
            Intent i = new Intent(this, ShoplistActivity.class);
            startActivity(i);
        }

        else if(v.getId() == R.id.buttonCategories)
        {
            Intent i = new Intent(this, CategoriesActivity.class);
            startActivity(i);
        }

        else if(v.getId() == R.id.buttonWebview)
        {
            loadUrl(launchUrl);
        }
    }
}
