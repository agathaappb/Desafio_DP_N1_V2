package com.agathaappb.desafio_dp_n1_v2.ValidadorDados

class VerificaDadosCNPJ : VerificaDados {
    override fun verificaDado(inputUsuario: String): String {

        var codigo1 = codigoVerificadorCNPJ1(inputUsuario)
        var codigo2 = codigoVerificadorCNPJ2(inputUsuario)

        if (codigo1 == Integer.parseInt(inputUsuario.get(12).toString()) && codigo2 == Integer.parseInt(inputUsuario.get(13).toString())){
            return "CNPJ válido"
        }else return "CNPJ inválido"

        return "Dado incorreto!"
    }


    fun codigoVerificadorCNPJ1(inputUsuario: String):Int{
        var codigoVericacaoCNPJ1 =0
        var codigoverificacao1 =0
        var ii = 0

        for(i in 5 downTo 2){
            codigoVericacaoCNPJ1 = ((Integer.parseInt(inputUsuario.get(ii).toString())*i)+codigoVericacaoCNPJ1)
            ii++
        }
        for(j in 9 downTo 2){
            codigoVericacaoCNPJ1 = ((Integer.parseInt(inputUsuario.get(ii).toString())*j)+codigoVericacaoCNPJ1)
            ii++
        }
        var resto = codigoVericacaoCNPJ1 % 11

        if(resto < 2){
            codigoverificacao1 = 0
            return codigoverificacao1
        }else if(resto >= 2){
            codigoverificacao1 = 11-resto
            return codigoverificacao1
        }else return -1
    }

    fun codigoVerificadorCNPJ2(inputUsuario: String):Int{
        var codigoVericacaoCNPJ2 =0
        var codigoverificacao2 = 0
        var ii = 0

        for(i in 6 downTo 2){
            codigoVericacaoCNPJ2 = ((Integer.parseInt(inputUsuario.get(ii).toString())*i)+codigoVericacaoCNPJ2)
            ii++
        }
        for(j in 9 downTo 2){
            codigoVericacaoCNPJ2 = ((Integer.parseInt(inputUsuario.get(ii).toString())*j)+codigoVericacaoCNPJ2)
            ii++
        }
        var resto = codigoVericacaoCNPJ2 % 11

        if(resto < 2){
            codigoverificacao2 = 0
            return codigoverificacao2
        }else if(resto >= 2){
            codigoverificacao2 = 11-resto
            return codigoverificacao2
        }else return -1

    }
}