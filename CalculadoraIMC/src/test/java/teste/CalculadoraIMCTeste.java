package teste;

import control.CalculadoraIMC;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraIMCTeste {
    CalculadoraIMC calculadora = new CalculadoraIMC();

    // Faixas de IMC para adultos (20 a 65 anos)
    @Test
    public void testeImcAdultoBaixoPesoMuitoGrave() {
        assertEquals("Baixo peso muito grave", calculadora.calcularImc(46.20, 1.70, 30, "masculino"));
    }

    @Test
    public void testeImcAdultoBaixoPesoGrave() {
        assertEquals("Baixo peso grave", calculadora.calcularImc(46.24, 1.70, 30, "masculino"));
        assertEquals("Baixo peso grave", calculadora.calcularImc(49.10, 1.70, 30, "masculino"));
    }

    @Test
    public void testeImcAdultoBaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(49.15, 1.70, 30, "masculino"));
        assertEquals("Baixo peso", calculadora.calcularImc(53.45, 1.70, 30, "masculino"));
    }

    @Test
    public void testeImcAdultoPesoNormal() {
        assertEquals("Peso normal", calculadora.calcularImc(53.47, 1.70, 30, "masculino"));
        assertEquals("Peso normal", calculadora.calcularImc(72.23, 1.70, 30, "masculino"));
    }

    @Test
    public void testeImcAdultoSobrepeso() {
        assertEquals("Sobrepeso", calculadora.calcularImc(72.25, 1.70, 30, "masculino"));
        assertEquals("Sobrepeso", calculadora.calcularImc(86.65, 1.70, 30, "masculino"));
    }

    @Test
    public void testeImcAdultoObesidadeGrauI() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(86.7, 1.70, 30, "masculino"));
        assertEquals("Obesidade grau I", calculadora.calcularImc(101.12, 1.70, 30, "masculino"));
    }

    @Test
    public void testeImcAdultoObesidadeGrauII() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(101.15, 1.70, 30, "masculino"));
        assertEquals("Obesidade grau II", calculadora.calcularImc(115.57, 1.70, 30, "masculino"));
    }

    @Test
    public void testeImcAdultoObesidadeGrauIII() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.calcularImc(115.8, 1.70, 30, "masculino"));
    }


    //Idoso Masculino
    @Test
    public void testeImcIdosoMasculinoBaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(61.35, 1.67, 70, "masculino"));
    }

    @Test
    public void testeImcIdosoMasculinoPesoNormal() {
        assertEquals("Peso normal", calculadora.calcularImc(61.36, 1.67, 70, "masculino"));
        assertEquals("Peso normal", calculadora.calcularImc(75.57, 1.67, 70, "masculino"));
    }

    @Test
    public void testeImcIdosoMasculinoSobrepeso() {
        assertEquals("Sobrepeso", calculadora.calcularImc(75.58, 1.67, 70, "masculino"));
        assertEquals("Sobrepeso", calculadora.calcularImc(83.94, 1.67, 70, "masculino"));
    }

    @Test
    public void testeImcIdosoMasculinoObesidadeGrauI() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(83.95, 1.67, 70, "masculino"));
        assertEquals("Obesidade grau I", calculadora.calcularImc(97.89, 1.67, 70, "masculino"));
    }

    @Test
    public void testeImcIdosoMasculinoObesidadeGrauII() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(97.9, 1.67, 70, "masculino"));
        assertEquals("Obesidade grau II", calculadora.calcularImc(111.5, 1.67, 70, "masculino"));
    }

    @Test
    public void testeImcIdosoMasculinoObesidadeGrauIII() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.calcularImc(111.6, 1.67, 70, "masculino"));
    }

    // Idosos (femininos)
    @Test
    public void testeImcIdosoFemininoBaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(56.32, 1.60, 70, "feminino"));
    }

    @Test
    public void testeImcIdosoFemininoPesoNormal() {
        assertEquals("Peso normal", calculadora.calcularImc(56.33, 1.60, 70, "feminino"));
        assertEquals("Peso normal", calculadora.calcularImc(69.2, 1.60, 70, "feminino"));
    }

    @Test
    public void testeImcIdosoFemininoSobrepeso() {
        assertEquals("Sobrepeso", calculadora.calcularImc(69.5, 1.60, 70, "feminino"));
        assertEquals("Sobrepeso", calculadora.calcularImc(82.17, 1.60, 70, "feminino"));
    }

    @Test
    public void testeImcIdosoFemininoObesidadeGrauI() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(82.18, 1.60, 70, "feminino"));
        assertEquals("Obesidade grau I", calculadora.calcularImc(92.97, 1.60, 70, "feminino"));
    }

    @Test
    public void testeImcIdosoFemininoObesidadeGrauII() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(94.98, 1.60, 70, "feminino"));
        assertEquals("Obesidade grau II", calculadora.calcularImc(107.52, 1.60, 70, "feminino"));
    }

    @Test
    public void testeImcIdosoFemininoObesidadeGrauIII() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.calcularImc(107.53, 1.60, 70, "feminino"));
    }

    //Menino 2anos
    @Test
    public void testeImcMenino2BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(10.6, 0.85, 2, "masculino"));
    }

    @Test
    public void testeImcMenino2PesoNormal() {
        assertEquals("Peso normal", calculadora.calcularImc(10.7, 0.85, 2, "masculino"));
        assertEquals("Peso normal", calculadora.calcularImc(13.14, 0.85, 2, "masculino"));
    }

    @Test
    public void testeImcMenino2Sobrepeso() {
        assertEquals("Sobrepeso", calculadora.calcularImc(13.15, 0.85, 2, "masculino"));
        assertEquals("Sobrepeso", calculadora.calcularImc(13.87, 0.85, 2, "masculino"));
    }

    @Test
    public void testeImcMenino2Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(13.88, 0.85, 2, "masculino"));
    }

    //Menino 4anos
    @Test
    public void testeImcMenino4BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(12.63, 0.95, 4, "masculino"));
    }

    @Test
    public void testeImcMenino4PesoNormal() {
        assertEquals("Peso normal", calculadora.calcularImc(12.64, 0.95, 4, "masculino"));
        assertEquals("Peso normal", calculadora.calcularImc(15.34, 0.95, 4, "masculino"));
    }

    @Test
    public void testeImcMenino4Sobrepeso() {
        assertEquals("Sobrepeso", calculadora.calcularImc(15.35, 0.95, 4, "masculino"));
        assertEquals("Sobrepeso", calculadora.calcularImc(16.15, 0.95, 4, "masculino"));
    }

    @Test
    public void testeImcMenino4Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(16.16, 0.95, 4, "masculino"));
    }

    //Menino 6anos
    @Test
    public void testeImcMenino6BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(18.25, 1.15, 6, "masculino"));
    }

    @Test
    public void testeImcMenino6PesoNormal() {
        assertEquals("Peso normal", calculadora.calcularImc(18.26, 1.15, 6, "masculino"));
        assertEquals("Peso normal", calculadora.calcularImc(22.48, 1.15, 6, "masculino"));
    }

    @Test
    public void testeImcMenino6Sobrepeso() {
        assertEquals("Sobrepeso", calculadora.calcularImc(22.49, 1.15, 6, "masculino"));
        assertEquals("Sobrepeso", calculadora.calcularImc(24.33, 1.15, 6, "masculino"));
    }

    @Test
    public void testeImcMenino6Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(24.34, 1.15, 6, "masculino"));
    }

    //Menino 8anos
    @Test
    public void testeImcMenino8BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(23.32, 1.30, 8, "masculino"));
    }

    @Test
    public void testeImcMenino8PesoNormal() {
        assertEquals("Peso normal", calculadora.calcularImc(23.33, 1.30, 8, "masculino"));
        assertEquals("Peso normal", calculadora.calcularImc(30.41, 1.30, 8, "masculino"));
    }

    @Test
    public void testeImcMenino8Sobrepeso() {
        assertEquals("Sobrepeso", calculadora.calcularImc(30.42, 1.30, 8, "masculino"));
        assertEquals("Sobrepeso", calculadora.calcularImc(33.8, 1.30, 8, "masculino"));
    }

    @Test
    public void testeImcMenino8Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(33.81, 1.30, 8, "masculino"));
    }

    //Menino 10anos
    @Test
    public void testeImcMenino10BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(29.85, 1.45, 10, "masculino"));
    }

    @Test
    public void testeImcMenino10PesoNormal() {
        assertEquals("Peso normal", calculadora.calcularImc(29.86, 1.45, 10, "masculino"));
        assertEquals("Peso normal", calculadora.calcularImc(40.36, 1.45, 10, "masculino"));
    }

    @Test
    public void testeImcMenino10Sobrepeso() {
        assertEquals("Sobrepeso", calculadora.calcularImc(40.37, 1.45, 10, "masculino"));
        assertEquals("Sobrepeso", calculadora.calcularImc(46.25, 1.45, 10, "masculino"));
    }

    @Test
    public void testeImcMenino10Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(46.26, 1.45, 10, "masculino"));
    }


    //Menina 2anos
    @Test
    public void testeImcMenina2BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(10.4, 0.85, 2, "feminino"));
    }

    @Test
    public void testeImcMenina2PesoNormal() {
        assertEquals("Peso normal", calculadora.calcularImc(10.5, 0.85, 2, "feminino"));
        assertEquals("Peso normal", calculadora.calcularImc(13, 0.85, 2, "feminino"));
    }

    @Test
    public void testeImcMenina2Sobrepeso() {
        assertEquals("Sobrepeso", calculadora.calcularImc(13.1, 0.85, 2, "feminino"));
        assertEquals("Sobrepeso", calculadora.calcularImc(13.79, 0.85, 2, "feminino"));
    }

    @Test
    public void testeImcMenina2Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(13.8, 0.85, 2, "feminino"));
    }

    //Menina 4anos
    @Test
    public void testeImcMenina4BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(12.45, 0.95, 4, "feminino"));
    }

    @Test
    public void testeImcMenina4PesoNormal() {
        assertEquals("Peso normal", calculadora.calcularImc(12.46, 0.95, 4, "feminino"));
        assertEquals("Peso normal", calculadora.calcularImc(15.16, 0.95, 4, "feminino"));
    }

    @Test
    public void testeImcMenina4Sobrepeso() {
        assertEquals("Sobrepeso", calculadora.calcularImc(15.17, 0.95, 4, "feminino"));
        assertEquals("Sobrepeso", calculadora.calcularImc(16.24, 0.95, 4, "feminino"));
    }

    @Test
    public void testeImcMenina4Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(16.25, 0.95, 4, "feminino"));
    }

    @Test
    public void testeImcMenina6BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(17.72, 1.15, 6, "feminino"));
    }

    @Test
    public void testeImcMenina6PesoNormal() {
        assertEquals("Peso normal", calculadora.calcularImc(17.73, 1.15, 6, "feminino"));
        assertEquals("Peso normal", calculadora.calcularImc(22.48, 1.15, 6, "feminino"));
    }

    @Test
    public void testeImcMenina6Sobrepeso() {
        assertEquals("Sobrepeso", calculadora.calcularImc(22.49, 1.15, 6, "feminino"));
        assertEquals("Sobrepeso", calculadora.calcularImc(24.86, 1.15, 6, "feminino"));
    }

    @Test
    public void testeImcMenina6Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(24.87, 1.15, 6, "feminino"));
    }

    @Test
    public void testeImcMenina8BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(22.98, 1.30, 8, "feminino"));
    }

    @Test
    public void testeImcMenina8PesoNormal() {
        assertEquals("Peso normal", calculadora.calcularImc(22.99, 1.30, 8, "feminino"));
        assertEquals("Peso normal", calculadora.calcularImc(30.75, 1.30, 8, "feminino"));
    }

    @Test
    public void testeImcMenina8Sobrepeso() {
        assertEquals("Sobrepeso", calculadora.calcularImc(30.76, 1.30, 8, "feminino"));
        assertEquals("Sobrepeso", calculadora.calcularImc(34.81, 1.30, 8, "feminino"));
    }

    @Test
    public void testeImcMenina8Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(34.82, 1.30, 8, "feminino"));
    }

    @Test
    public void testeImcMenina10BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(29.43, 1.45, 10, "feminino"));
    }

    @Test
    public void testeImcMenina10PesoNormal() {
        assertEquals("Peso normal", calculadora.calcularImc(29.44, 1.45, 10, "feminino"));
        assertEquals("Peso normal", calculadora.calcularImc(42.04, 1.45, 10, "feminino"));
    }

    @Test
    public void testeImcMenina10Sobrepeso() {
        assertEquals("Sobrepeso", calculadora.calcularImc(42.05, 1.45, 10, "feminino"));
        assertEquals("Sobrepeso", calculadora.calcularImc(48.35, 1.45, 10, "feminino"));
    }

    @Test
    public void testeImcMenina10Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(48.36, 1.45, 10, "feminino"));
    }
}
