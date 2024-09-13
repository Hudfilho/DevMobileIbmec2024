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
    public void testeImcAdultoBaixoPesoGraveLimInferior() {
        assertEquals("Baixo peso grave", calculadora.calcularImc(46.24, 1.70, 30, "masculino"));
    }
    @Test
    public void testeImcAdultoBaixoPesoGraveLimSuperior() {
        assertEquals("Baixo peso grave", calculadora.calcularImc(49.10, 1.70, 30, "masculino"));
    }

    @Test
    public void testeImcAdultoBaixoPesoLimInferior() {
        assertEquals("Baixo peso", calculadora.calcularImc(49.15, 1.70, 30, "masculino"));
    }
    @Test
    public void testeImcAdultoBaixoPesoLimSuperior() {
        assertEquals("Baixo peso", calculadora.calcularImc(53.45, 1.70, 30, "masculino"));
    }

    @Test
    public void testeImcAdultoPesoNormalLimInferior() {
        assertEquals("Peso normal", calculadora.calcularImc(53.47, 1.70, 30, "masculino"));
    }
    @Test
    public void testeImcAdultoPesoNormalLimSuperior() {
        assertEquals("Peso normal", calculadora.calcularImc(72.23, 1.70, 30, "masculino"));
    }

    @Test
    public void testeImcAdultoSobrepesoLimInferior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(72.25, 1.70, 30, "masculino"));
    }
    @Test
    public void testeImcAdultoSobrepesoLimSuperior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(86.65, 1.70, 30, "masculino"));
    }

    @Test
    public void testeImcAdultoObesidadeGrauILimInferior() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(86.7, 1.70, 30, "masculino"));
    }
    @Test
    public void testeImcAdultoObesidadeGrauILimSuperior() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(101.12, 1.70, 30, "masculino"));
    }

    @Test
    public void testeImcAdultoObesidadeGrauIILimInferior() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(101.15, 1.70, 30, "masculino"));
    }
    @Test
    public void testeImcAdultoObesidadeGrauII() {
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
    public void testeImcIdosoMasculinoPesoNormalLimInferior() {
        assertEquals("Peso normal", calculadora.calcularImc(61.36, 1.67, 70, "masculino"));
    }

    @Test
    public void testeImcIdosoMasculinoPesoNormalLimSuperior() {
        assertEquals("Peso normal", calculadora.calcularImc(75.57, 1.67, 70, "masculino"));
    }


    @Test
    public void testeImcIdosoMasculinoSobrepesoLimInferior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(75.58, 1.67, 70, "masculino"));
    }

    @Test
    public void testeImcIdosoMasculinoSobrepesoLimSuperior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(83.94, 1.67, 70, "masculino"));
    }

    @Test
    public void testeImcIdosoMasculinoObesidadeGrauILimInferior() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(83.95, 1.67, 70, "masculino"));
    }

    @Test
    public void testeImcIdosoMasculinoObesidadeGrauILimSuperior() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(97.89, 1.67, 70, "masculino"));
    }


    @Test
    public void testeImcIdosoMasculinoObesidadeGrauIILimInferior() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(97.90, 1.67, 70, "masculino"));
    }

    @Test
    public void testeImcIdosoMasculinoObesidadeGrauIILimSuperior() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(111.50, 1.67, 70, "masculino"));
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
    public void testeImcIdosoFemininoPesoNormalLimInferior() {
        assertEquals("Peso normal", calculadora.calcularImc(56.33, 1.60, 70, "feminino"));
    }

    @Test
    public void testeImcIdosoFemininoPesoNormalLimSuperior() {
        assertEquals("Peso normal", calculadora.calcularImc(69.20, 1.60, 70, "feminino"));
    }

    @Test
    public void testeImcIdosoFemininoSobrepesoLimInferior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(69.50, 1.60, 70, "feminino"));
    }

    @Test
    public void testeImcIdosoFemininoSobrepesoLimSuperior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(82.17, 1.60, 70, "feminino"));
    }

    @Test
    public void testeImcIdosoFemininoObesidadeGrauILimInferior() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(82.18, 1.60, 70, "feminino"));
    }

    @Test
    public void testeImcIdosoFemininoObesidadeGrauILimSuperior() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(92.97, 1.60, 70, "feminino"));
    }

    @Test
    public void testeImcIdosoFemininoObesidadeGrauIILimInferior() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(94.98, 1.60, 70, "feminino"));
    }

    @Test
    public void testeImcIdosoFemininoObesidadeGrauIILimSuperior() {
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
    public void testeImcMenino2PesoNormalLimInferior() {
        assertEquals("Peso normal", calculadora.calcularImc(10.7, 0.85, 2, "masculino"));
    }

    @Test
    public void testeImcMenino2PesoNormalLimSuperior() {
        assertEquals("Peso normal", calculadora.calcularImc(13.14, 0.85, 2, "masculino"));
    }

    @Test
    public void testeImcMenino2SobrepesoLimInferior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(13.15, 0.85, 2, "masculino"));
    }

    @Test
    public void testeImcMenino2SobrepesoLimSuperior() {
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
    public void testeImcMenino4PesoNormalLimInferior() {
        assertEquals("Peso normal", calculadora.calcularImc(12.64, 0.95, 4, "masculino"));
    }

    @Test
    public void testeImcMenino4PesoNormalLimSuperior() {
        assertEquals("Peso normal", calculadora.calcularImc(15.34, 0.95, 4, "masculino"));
    }

    @Test
    public void testeImcMenino4SobrepesoLimInferior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(15.35, 0.95, 4, "masculino"));
    }

    @Test
    public void testeImcMenino4SobrepesoLimSuperior() {
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
    public void testeImcMenino6PesoNormalLimInferior() {
        assertEquals("Peso normal", calculadora.calcularImc(18.26, 1.15, 6, "masculino"));
    }

    @Test
    public void testeImcMenino6PesoNormalLimSuperior() {
        assertEquals("Peso normal", calculadora.calcularImc(22.48, 1.15, 6, "masculino"));
    }

    @Test
    public void testeImcMenino6SobrepesoLimInferior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(22.49, 1.15, 6, "masculino"));
    }

    @Test
    public void testeImcMenino6SobrepesoLimSuperior() {
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
    public void testeImcMenino8PesoNormalLimInferior() {
        assertEquals("Peso normal", calculadora.calcularImc(23.33, 1.30, 8, "masculino"));
    }

    @Test
    public void testeImcMenino8PesoNormalLimSuperior() {
        assertEquals("Peso normal", calculadora.calcularImc(30.41, 1.30, 8, "masculino"));
    }

    @Test
    public void testeImcMenino8SobrepesoLimInferior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(30.42, 1.30, 8, "masculino"));
    }

    @Test
    public void testeImcMenino8SobrepesoLimSuperior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(33.80, 1.30, 8, "masculino"));
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
    public void testeImcMenino10PesoNormalLimInferior() {
        assertEquals("Peso normal", calculadora.calcularImc(29.86, 1.45, 10, "masculino"));
    }

    @Test
    public void testeImcMenino10PesoNormalLimSuperior() {
        assertEquals("Peso normal", calculadora.calcularImc(40.36, 1.45, 10, "masculino"));
    }

    @Test
    public void testeImcMenino10SobrepesoLimInferior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(40.37, 1.45, 10, "masculino"));
    }

    @Test
    public void testeImcMenino10SobrepesoLimSuperior() {
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
    public void testeImcMenina2PesoNormalLimInferior() {
        assertEquals("Peso normal", calculadora.calcularImc(10.5, 0.85, 2, "feminino"));
    }

    @Test
    public void testeImcMenina2PesoNormalLimSuperior() {
        assertEquals("Peso normal", calculadora.calcularImc(13.0, 0.85, 2, "feminino"));
    }

    @Test
    public void testeImcMenina2SobrepesoLimInferior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(13.1, 0.85, 2, "feminino"));
    }

    @Test
    public void testeImcMenina2SobrepesoLimSuperior() {
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
    public void testeImcMenina4PesoNormalLimInferior() {
        assertEquals("Peso normal", calculadora.calcularImc(12.46, 0.95, 4, "feminino"));
    }

    @Test
    public void testeImcMenina4PesoNormalLimSuperior() {
        assertEquals("Peso normal", calculadora.calcularImc(15.16, 0.95, 4, "feminino"));
    }

    @Test
    public void testeImcMenina4SobrepesoLimInferior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(15.17, 0.95, 4, "feminino"));
    }

    @Test
    public void testeImcMenina4SobrepesoLimSuperior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(16.24, 0.95, 4, "feminino"));
    }

    @Test
    public void testeImcMenina4Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(16.25, 0.95, 4, "feminino"));
    }

    //Menina 6anos
    @Test
    public void testeImcMenina6BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(17.72, 1.15, 6, "feminino"));
    }

    @Test
    public void testeImcMenina6PesoNormalLimInferior() {
        assertEquals("Peso normal", calculadora.calcularImc(17.73, 1.15, 6, "feminino"));
    }

    @Test
    public void testeImcMenina6PesoNormalLimSuperior() {
        assertEquals("Peso normal", calculadora.calcularImc(22.48, 1.15, 6, "feminino"));
    }

    @Test
    public void testeImcMenina6SobrepesoLimInferior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(22.49, 1.15, 6, "feminino"));
    }

    @Test
    public void testeImcMenina6SobrepesoLimSuperior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(24.86, 1.15, 6, "feminino"));
    }

    @Test
    public void testeImcMenina6Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(24.87, 1.15, 6, "feminino"));
    }

    //Menina 8anos
    @Test
    public void testeImcMenina8BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(22.98, 1.30, 8, "feminino"));
    }

    @Test
    public void testeImcMenina8PesoNormalLimInferior() {
        assertEquals("Peso normal", calculadora.calcularImc(22.99, 1.30, 8, "feminino"));
    }

    @Test
    public void testeImcMenina8PesoNormalLimSuperior() {
        assertEquals("Peso normal", calculadora.calcularImc(30.75, 1.30, 8, "feminino"));
    }

    @Test
    public void testeImcMenina8SobrepesoLimInferior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(30.76, 1.30, 8, "feminino"));
    }

    @Test
    public void testeImcMenina8SobrepesoLimSuperior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(34.81, 1.30, 8, "feminino"));
    }

    @Test
    public void testeImcMenina8Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(34.82, 1.30, 8, "feminino"));
    }

    //Menina 10anos
    @Test
    public void testeImcMenina10BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(29.43, 1.45, 10, "feminino"));
    }

    @Test
    public void testeImcMenina10PesoNormalLimInferior() {
        assertEquals("Peso normal", calculadora.calcularImc(29.44, 1.45, 10, "feminino"));
    }

    @Test
    public void testeImcMenina10PesoNormalLimSuperior() {
        assertEquals("Peso normal", calculadora.calcularImc(42.04, 1.45, 10, "feminino"));
    }

    @Test
    public void testeImcMenina10SobrepesoLimInferior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(42.05, 1.45, 10, "feminino"));
    }

    @Test
    public void testeImcMenina10SobrepesoLimSuperior() {
        assertEquals("Sobrepeso", calculadora.calcularImc(48.35, 1.45, 10, "feminino"));
    }

    @Test
    public void testeImcMenina10Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(48.36, 1.45, 10, "feminino"));
    }
}
