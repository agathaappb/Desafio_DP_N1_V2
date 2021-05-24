package com.agathaappb.desafio_dp_n1_v2.ValidadorDados

class VerificaDadosCPF: VerificaDados {
    override fun verificaDado(inputUsuario: String): String{

        var codigo1 = codigoVerificadorCPF1(inputUsuario)
        var codigo2 = codigoVerificadorCPF2(inputUsuario)

        if (codigo1 == Integer.parseInt(inputUsuario.get(9).toString()) && codigo2 == Integer.parseInt(inputUsuario.get(10).toString())){
            return "CPF válido"
        }else return "CPF inválido"

        return "Dado incorreto!"
    }

    fun codigoVerificadorCPF1(inputUsuario: String):Int{

        var verificadorCPF = 0
        var codigoverificacao1 = 0
        var ii = 0
        for(i in 10 downTo 2){

            var digitoCPF = Integer.parseInt(inputUsuario.get(ii).toString())
            verificadorCPF =((digitoCPF*i) + verificadorCPF)
            ii= ii+1
        }
        var resto = verificadorCPF%11

        if(resto < 2){
            codigoverificacao1 = 0
            return codigoverificacao1
        }else if(resto >= 2){
            codigoverificacao1 = 11-resto
            return codigoverificacao1
        }else return -1
    }
    fun codigoVerificadorCPF2(inputUsuario: String):Int{

        var verificadorCPF2 = 0
        var codigoverificacao2 = 0
        var ii = 0

        for(i in 11 downTo 2){
            var codigoCPF2 = Integer.parseInt(inputUsuario.get(ii).toString())
            verificadorCPF2 = ((codigoCPF2*i)+verificadorCPF2)
            ii++
        }
        var resto = verificadorCPF2%11

        if(resto < 2){
            codigoverificacao2 = 0
            return codigoverificacao2
        }else if(resto >= 2){
            codigoverificacao2 = 11-resto
            return codigoverificacao2
        }else return -1
    }
}