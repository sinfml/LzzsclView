package com.sin.lzzsclview.config

/**
 * Created by sin on 2019/2/1.
 */

enum class ChessConfig  constructor(var chessName: String, var race1: String, var race2: String?,var profession: String, var level: Int, var skill1: String, var skill2: String?) {


    Luna("Luna", "Elf", null, "Knight", 2, "", null),
    CK("CK" ,"Demon" , null , "Knight" , 2 , "" , null),
    LOA("LOA" , "Undead" , null , "Knight" , 3 , "" , null),
    OK("OK" , "Human" , null , "Knight" , 3 , "" , null),
    DK("DK" , "Human" , "Dragon" , "Knight" , 4 , "" , null)


}
