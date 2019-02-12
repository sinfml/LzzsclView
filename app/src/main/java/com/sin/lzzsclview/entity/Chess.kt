package com.sin.lzzsclview.entity

import com.sin.lzzsclview.config.ChessConfig

/**
 * Created by sin on 2019/2/1.
 */

abstract class Chess(chessName: String) {

//    var chessId : Int = 0

    var chessName: String? = null
    var race1: String? = null
    var race2: String? = null
    var profession: String? = null
    var level: Int = 0
    var starts : Int = 1
    var skill1: String? = null
    var skill2: String? = null


    companion object {
        private val TAG = Chess::class.java.simpleName
        private val LOG = true
    }


    init {
        val chess = ChessConfig.valueOf(chessName)
        this.chessName = chess.chessName
        this.race1 = chess.race1
        this.race2 = chess.race2
        this.profession = chess.profession
        this.level = chess.level
        this.starts = chess.starts
        this.skill1 = chess.skill1
        this.skill2 = chess.skill2
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Chess

//        if (chessId != other.chessId) return false
        if (chessName != other.chessName) return false
        if (level != other.level) return false
        if (starts != other.starts) return false
        return true
    }

    override fun toString(): String {
        return "Chess(chessName=$chessName, race1=$race1, race2=$race2, profession=$profession, level=$level, starts=$starts, skill1=$skill1, skill2=$skill2)"
    }


}
