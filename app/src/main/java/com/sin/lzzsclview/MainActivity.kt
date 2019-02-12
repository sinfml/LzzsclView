package com.sin.lzzsclview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sin.lzzsclview.entity.ChessCK
import com.sin.lzzsclview.entity.ChessLuna

import com.sin.lzzsclview.view.LzzsclView

class MainActivity : AppCompatActivity() {

    private var lzzsclView: LzzsclView? = null

    private val i: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

        val chessBoard = CheckerBoard()
        chessBoard.put(ChessLuna())
        chessBoard.put(ChessLuna())
        chessBoard.put(ChessLuna())
        chessBoard.put(ChessCK())


    }

    private fun initView() {
        lzzsclView = findViewById(R.id.lzzscl_view)
    }

    companion object {

        private val TAG = MainActivity::class.java.simpleName

        private val LOG = true
    }
}
