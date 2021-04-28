package com.aradsheybak.bottomnavigation

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class MainActivity : AppCompatActivity() {

    @BindView(R.id.iv_home)
    lateinit var iv_home: ImageView

    @BindView(R.id.iv_favorite)
    lateinit var iv_favorite: ImageView

    @BindView(R.id.iv_shopping_bag)
    lateinit var iv_shopping_bag: ImageView

    @BindView(R.id.iv_profile)
    lateinit var iv_profile: ImageView

    private var previousItem : String = "home"

    @OnClick(R.id.iv_home)
    fun ivHomeClicked(){
        deselectItems(previousItem)
        homeClicked()
    }

    @OnClick(R.id.iv_favorite)
    fun ivFavoriteClicked(){
        deselectItems(previousItem)
        favoriteClicked()
    }

    @OnClick(R.id.iv_shopping_bag)
    fun ivShoppingClicked() {
        deselectItems(previousItem)
        shoppingBagClicked()
    }

    @OnClick(R.id.iv_profile)
    fun ivProfileClicked(){
        deselectItems(previousItem)
        profileClicked()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        homeClicked()
    }

    private fun homeClicked(){
        iv_home.setImageDrawable(getDrawable(R.drawable.ic_home_white))
        iv_home.background = getDrawable(R.drawable.shp_circle_black)
        iv_home.setPadding(40,40,40,40)
        previousItem = "home"

    }

    private fun favoriteClicked(){
        iv_favorite.setImageDrawable(getDrawable(R.drawable.ic_favorite_white))
        iv_favorite.background = getDrawable(R.drawable.shp_circle_black)
        iv_favorite.setPadding(40,40,40,40)
        previousItem = "favorite"
    }

    private fun shoppingBagClicked(){
        iv_shopping_bag.setImageDrawable(getDrawable(R.drawable.ic_shopping_bag_white))
        iv_shopping_bag.background = getDrawable(R.drawable.shp_circle_black)
        iv_shopping_bag.setPadding(40,40,40,40)
        previousItem = "shoppingBag"
    }
    private fun profileClicked(){
        iv_profile.setImageDrawable(getDrawable(R.drawable.ic_profile_white))
        iv_profile.background = getDrawable(R.drawable.shp_circle_black)
        iv_profile.setPadding(40,40,40,40)
        previousItem = "profile"
    }

    private fun deselectItems(item : String){
        when(item){
            "home" -> {
                iv_home.setImageDrawable(getDrawable(R.drawable.ic_home_black))
                iv_home.setBackgroundResource(0)
                iv_home.setPadding(0,0,0,0)

            }

            "favorite" -> {
                iv_favorite.setImageDrawable(getDrawable(R.drawable.ic_favorite_black))
                iv_favorite.setBackgroundResource(0)
                iv_favorite.setPadding(0,0,0,0)
            }

            "shoppingBag" -> {
                iv_shopping_bag.setImageDrawable(getDrawable(R.drawable.ic_shopping_bag_black))
                iv_shopping_bag.setBackgroundResource(0)
                iv_shopping_bag.setPadding(0,0,0,0)
            }

            "profile" -> {
                iv_profile.setImageDrawable(getDrawable(R.drawable.ic_profile_black))
                iv_profile.setBackgroundResource(0)
                iv_profile.setPadding(0,0,0,0)
            }



        }

    }

}