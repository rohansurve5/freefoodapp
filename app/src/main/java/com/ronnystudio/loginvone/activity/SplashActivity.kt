/*
*  SplashActivity.kt
*  Source
*
*  Created by ronnystudio.
*  Copyright © 2018 ronnystudio. All rights reserved.
*/

package com.ronnystudio.loginvone.activity

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.PointF
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.ronnystudio.loginvone.R
import io.supernova.uitoolkit.drawable.LinearGradientDrawable


class SplashActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, SplashActivity::class.java)
		}
	}
	
	private lateinit var baseConstraintLayout: View
	private lateinit var viewButton: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.splash_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Base component
		baseConstraintLayout = this.findViewById(R.id.base_constraint_layout)
		baseConstraintLayout.background = LinearGradientDrawable.Builder(this, PointF(0.49f, -0f), PointF(0.49f, 0.86f)).addStop(0f, Color.argb(0, 0, 0, 0)).addStop(1f, Color.argb(255, 0, 0, 0)).build()
		
		// Configure View component
		viewButton = this.findViewById(R.id.view_button)
		viewButton.setOnClickListener({ view ->
			this.onViewPressed()
		})
	}
	
	fun onViewPressed() {
	
	}
}
