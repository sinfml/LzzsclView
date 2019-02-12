package com.sin.lzzsclview

import android.util.Log
import com.sin.lzzsclview.entity.Chess
import java.util.*

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
                delFetter()
            }else{
                Log.e(TAG , "put $chess but over count !")
            }
        }
    }

    fun remove(chess: Chess){
        this.chessList?.remove(chess)
    }

    private fun delFetter(){
        checkUpdate(this.chessList!!)
        print(this.chessList!!)
    }

    private fun checkUpdate(chessList : ArrayList<Chess>) {
        var duplicateIndexes : Array<Int?> = arrayOfNulls(2)
        var tmpChess : Chess?
        var index = 0
        while (index < chessList.size){
            //clear the array !
            duplicateIndexes.let { duplicateIndexes.fill(0 , 0 , it.size) }

            tmpChess = chessList[index]
            var repeatCount = 0
            for ((i , value ) in chessList.withIndex()) {
                if (i != index && value == tmpChess){
                    duplicateIndexes[repeatCount] = i
                    repeatCount++
                }
            }
            if (repeatCount == 2){
                chessList[index].starts ++
                duplicateIndexes[0]?.let { chessList.removeAt(it) }
                duplicateIndexes[1]?.let { chessList.removeAt(it - 1) }
            }
            ++index
        }
    }

    private fun getResultList() : ArrayList<Chess>? {


        return null
    }

    private fun print(chessList : ArrayList<Chess>){
        if (LOG) {
            Log.i(TAG , " start print >>>>")
            for (chess in chessList) {
                Log.i(TAG , "chess $chess")
            }
            Log.i(TAG , "end print >>>>")
        }
    }

    companion object {
        private val TAG : String = CheckerBoard::class.java.simpleName
        private val LOG = true
        private val LimitChess = 10
    }

}