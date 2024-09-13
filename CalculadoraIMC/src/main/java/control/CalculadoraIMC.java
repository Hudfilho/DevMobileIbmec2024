package control;

public class CalculadoraIMC {
    public String calcularImc(double peso, double altura, int idade, String sexo){

        double imc =  peso/(altura*altura);

        //Calcular Imc para adultos(Idade>=20 && <=65) Idosos(Idade>=65) e Criancas(Idade<20)
        if (idade >= 20 && idade <= 65) {
            return imcAdulto(imc);
        } else if (idade > 65) {
            if(sexo.equalsIgnoreCase("masculino")){
                return imcIdosoMasculino(imc);
            }
            return imcIdosoFeminino(imc);
        }
        if(sexo.equalsIgnoreCase("masculino")){
            return imcMenino(imc, idade);
        }
        return imcMenina(imc, idade);
    }

    public String imcAdulto(double imc){
        if (imc < 16){
            return "Baixo peso muito grave";
        } else if (imc < 17) {
            return "Baixo peso grave";
        } else if (imc < 18.50) {
            return "Baixo peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade grau I";
        } else if (imc < 40) {
            return "Obesidade grau II";
        }
        return "Obesidade grau III (obesidade mórbida)";
    }

    private String imcIdosoMasculino(double imc) {
        if (imc < 22){
            return "Baixo peso";
        } else if (imc < 27.1) {
            return "Peso normal";
        } else if (imc < 30.1) {
            return "Sobrepeso";
        } else if (imc < 35.1) {
            return "Obesidade grau I";
        } else if (imc < 40) {
            return "Obesidade grau II";
        }
        return "Obesidade grau III (obesidade mórbida)";
    }

    private String imcIdosoFeminino(double imc) {
        if (imc < 22){
            return "Baixo peso";
        } else if (imc < 27.1) {
            return "Peso normal";
        } else if (imc < 32.1) {
            return "Sobrepeso";
        } else if (imc < 37.1) {
            return "Obesidade grau I";
        } else if (imc < 42) {
            return "Obesidade grau II";
        }
        return "Obesidade grau III (obesidade mórbida)";
    }

    private String imcMenino(double imc, int idade) {
        switch(idade){
            case 2:
                if (imc < 14.8) {
                    return "Baixo peso";
                } else if (imc < 18.2) {
                    return "Peso normal";
                } else if (imc < 19.2) {
                    return "Sobrepeso";
                }
                return "Obesidade";
            case 4:
                if (imc < 14) {
                    return "Baixo peso";
                } else if (imc < 17) {
                    return "Peso normal";
                } else if (imc < 17.9) {
                    return "Sobrepeso";
                }
                return "Obesidade";
            case 6:
                if (imc < 13.8) {
                    return "Baixo peso";
                } else if (imc < 17) {
                    return "Peso normal";
                } else if (imc < 18.4) {
                    return "Sobrepeso";
                }
                return "Obesidade";
            case 8:
                if (imc < 13.8) {
                    return "Baixo peso";
                } else if (imc < 18) {
                    return "Peso normal";
                } else if (imc < 20) {
                    return "Sobrepeso";
                }
                return "Obesidade";
            case 10:
                if (imc < 14.2) {
                    return "Baixo peso";
                } else if (imc < 19.2) {
                    return "Peso normal";
                } else if (imc < 22) {
                    return "Sobrepeso";
                }
                return "Obesidade";
            default:
                return "Idade nao suportada";
        }
    }
    private String imcMenina(double imc, int idade) {
        switch(idade){
            case 2:
                if (imc < 14.4) {
                    return "Baixo peso";
                } else if (imc < 18) {
                    return "Peso normal";
                } else if (imc < 19.1) {
                    return "Sobrepeso";
                } else {
                    return "Obesidade";
                }
            case 4:
                if (imc < 13.8) {
                    return "Baixo peso";
                } else if (imc < 16.8) {
                    return "Peso normal";
                } else if (imc < 18) {
                    return "Sobrepeso";
                } else {
                    return "Obesidade";
                }
            case 6:
                if (imc < 13.4) {
                    return "Baixo peso";
                } else if (imc < 17) {
                    return "Peso normal";
                } else if (imc < 18.8) {
                    return "Sobrepeso";
                } else {
                    return "Obesidade";
                }
            case 8:
                if (imc < 13.6) {
                    return "Baixo peso";
                } else if (imc < 18.2) {
                    return "Peso normal";
                } else if (imc < 20.6) {
                    return "Sobrepeso";
                } else {
                    return "Obesidade";
                }
            case 10:
                if (imc < 14) {
                    return "Baixo peso";
                } else if (imc < 20) {
                    return "Peso normal";
                } else if (imc < 23) {
                    return "Sobrepeso";
                } else {
                    return "Obesidade";
                }
            default:
                return "Idade nao suportada";
        }
    }

}
