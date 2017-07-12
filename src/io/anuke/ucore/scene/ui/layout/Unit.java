package io.anuke.ucore.scene.ui.layout;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;

public enum Unit{
	px{
		@Override
		public float inPixels(float amount){
			return amount;
		}
	},
	dp{
		@Override
		public float inPixels(float amount){
			//TODO rollback
			float scl = ((Gdx.app.getType() == ApplicationType.Desktop || Gdx.app.getType() == ApplicationType.WebGL) 
					? 1f : Gdx.graphics.getDensity() / 1.5f);
			return amount*scl;
		}
	};
	
	public abstract float inPixels(float amount);
}