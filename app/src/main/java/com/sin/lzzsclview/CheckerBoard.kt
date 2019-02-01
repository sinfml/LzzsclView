package com.sin.lzzsclview

import android.util.Log
import com.sin.lzzsclview.entity.Chess

/**
 * Created by sin on 2019/2/1.
 */
class CheckerBoard {

    private var chessList : ArrayList<Chess>? = null

    init {
        this.chessList = ArrayList()
    }

    fun put(chess: Chess){
        this.chessList?.let {
            if(it.size < LimitChess){
                it.add(chess)
            }else{
                Log.e(TAG , "put $chess but over count !")
            }
        }
    }

    fun remove(chess: Chess){
        this.chessList?.let {
            it.remove(chess)
        }
    }

    private fun delFetter(){

    }

    

    companion object {
        private val TAG : String = CheckerBoard::class.java.simpleName
        private val LOG = false
        private val LimitChess = 10
    }

}