package com.agathaappb.desafio_dp_n1_v2.ValidadorDados

class CategorizaDado {
    fun categorizaDados(dadoUsuario:String):String{
        if(dadoUsuario.length == 11){

            val validaCPF = VerificaDadosCPF()
            return validaCPF.verificaDado(dadoUsuario)

        }else if(dadoUsuario.length == 14){

            val validaCNPJ = VerificaDadosCNPJ()
            return validaCNPJ.verificaDado(dadoUsuario)

        }
        return "Dado inválido"
    }
}