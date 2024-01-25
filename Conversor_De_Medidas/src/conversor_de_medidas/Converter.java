/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor_de_medidas;

/**
 *
 * @author SYSTEM N.P
 */
public class Converter {

    public static double converter(Double QuantMedidaInicial, String TipoDeMedida, String MedidaInicial, String MedidaFinal) {

        if (TipoDeMedida.equalsIgnoreCase("Medidas De Tempo")) {

            switch (MedidaInicial) {
                case "Hora":
                    switch (MedidaFinal) {
                        case "Hora":
                            return QuantMedidaInicial;
                        case "Minuto":

                            return (QuantMedidaInicial * 60);

                        case "Segundo":
                            return (QuantMedidaInicial * 3600);

                        case "Semana":
                            return (QuantMedidaInicial / 168);

                        case "Dia":
                            return (QuantMedidaInicial / 24);

                        case "Mês":
                            return (QuantMedidaInicial / 730);

                        case "Ano":
                            return (QuantMedidaInicial / 8760);

                        case "Década":
                            return (QuantMedidaInicial / 87600);

                        case "Século":
                            return (QuantMedidaInicial / 876000);
                    }

                case "Minuto":
                    switch (MedidaFinal) {
                        case "Hora":
                            return (QuantMedidaInicial / 60);
                        case "Minuto":

                            return QuantMedidaInicial;

                        case "Segundo":
                            return (QuantMedidaInicial * 60);

                        case "Semana":
                            return (QuantMedidaInicial / 10080);

                        case "Dia":
                            return (QuantMedidaInicial / 1440);

                        case "Mês":
                            return (QuantMedidaInicial / 43800);

                        case "Ano":
                            return (QuantMedidaInicial / 525600);

                        case "Década":
                            return (QuantMedidaInicial / 5256000);

                        case "Século":
                            return (QuantMedidaInicial / 5256000);
                    }

                case "Semana":
                    switch (MedidaFinal) {
                        case "Hora":
                            return (QuantMedidaInicial * 168);
                        case "Minuto":

                            return (QuantMedidaInicial * 10080);

                        case "Segundo":
                            return (QuantMedidaInicial * 604800);

                        case "Semana":
                            return QuantMedidaInicial;

                        case "Dia":
                            return (QuantMedidaInicial * 7);

                        case "Mês":
                            return (QuantMedidaInicial / ((365 / 12) / 7));

                        case "Ano":
                            return (QuantMedidaInicial / (365 / 7));

                        case "Década":
                            return (QuantMedidaInicial / ((365 / 7) * 10));

                        case "Século":
                            return (QuantMedidaInicial / ((365 / 7) * 100));
                    }

                case "Segundo":
                    switch (MedidaFinal) {
                        case "Hora":
                            return (QuantMedidaInicial / 3600);
                        case "Minuto":

                            return (QuantMedidaInicial / 60);

                        case "Segundo":
                            return QuantMedidaInicial;

                        case "Semana":
                            return (QuantMedidaInicial / 604800);

                        case "Dia":
                            return (QuantMedidaInicial / 86400);

                        case "Mês":
                            return (QuantMedidaInicial / 2628000);

                        case "Ano":
                            return (QuantMedidaInicial / 31536000);

                        case "Década":
                            return (QuantMedidaInicial / 315360000);

                        case "Século":
                            return ((QuantMedidaInicial / 315360000) / 10);
                    }

                case "Dia":
                    switch (MedidaFinal) {
                        case "Hora":
                            return (QuantMedidaInicial * 24);
                        case "Minuto":

                            return (QuantMedidaInicial * 1440);

                        case "Segundo":
                            return (QuantMedidaInicial * 86400);

                        case "Semana":
                            return (QuantMedidaInicial / 7);

                        case "Dia":
                            return QuantMedidaInicial;

                        case "Mês":
                            return (QuantMedidaInicial / (365 / 12));

                        case "Ano":
                            return (QuantMedidaInicial / 365);

                        case "Década":
                            return (QuantMedidaInicial / 3650);

                        case "Século":
                            return (QuantMedidaInicial / 36500);
                    }

                case "Ano":
                    switch (MedidaFinal) {
                        case "Hora":
                            return (QuantMedidaInicial * 8760);
                        case "Minuto":

                            return (QuantMedidaInicial * 525600);

                        case "Segundo":
                            return (QuantMedidaInicial * 31536000);

                        case "Semana":
                            return (QuantMedidaInicial * (365 / 7));

                        case "Dia":
                            return QuantMedidaInicial * 365;

                        case "Mês":
                            return (QuantMedidaInicial * 12);

                        case "Ano":
                            return (QuantMedidaInicial);

                        case "Década":
                            return (QuantMedidaInicial / 10);

                        case "Século":
                            return (QuantMedidaInicial / 100);
                    }

                case "Década":
                    switch (MedidaFinal) {
                        case "Hora":
                            return (QuantMedidaInicial * 87600);
                        case "Minuto":

                            return (QuantMedidaInicial * 5256000);

                        case "Segundo":
                            return (QuantMedidaInicial * 315360000);

                        case "Semana":
                            return (QuantMedidaInicial * ((365 / 7) * 10));

                        case "Dia":
                            return QuantMedidaInicial * 3650;

                        case "Mês":
                            return (QuantMedidaInicial * 120);

                        case "Ano":
                            return (QuantMedidaInicial * 10);

                        case "Década":
                            return (QuantMedidaInicial);

                        case "Século":
                            return (QuantMedidaInicial / 10);
                    }

                case "Século":
                    switch (MedidaFinal) {
                        case "Hora":
                            return (QuantMedidaInicial * 876000);
                        case "Minuto":

                            return (QuantMedidaInicial * 52560000);

                        case "Segundo":
                            return ((QuantMedidaInicial * 315360000) * 10);

                        case "Semana":
                            return (QuantMedidaInicial * ((365 / 7) * 100));

                        case "Dia":
                            return QuantMedidaInicial * 36500;

                        case "Mês":
                            return (QuantMedidaInicial * 120);

                        case "Ano":
                            return (QuantMedidaInicial * 100);

                        case "Década":
                            return (QuantMedidaInicial * 10);

                        case "Século":
                            return QuantMedidaInicial;
                    }
            }
        }

        if (TipoDeMedida.equalsIgnoreCase("Medidas De Distância")) {

            switch (MedidaInicial) {
                case "Quilômetro (km)":
                    switch (MedidaFinal) {
                        case "Quilômetro (km)":
                            return QuantMedidaInicial;
                        case "Hectômetro (hm)":

                            return (QuantMedidaInicial * 10);

                        case "Decâmetro (dam)":
                            return (QuantMedidaInicial * 100);

                        case "metro (m)":
                            return (QuantMedidaInicial * 1000);

                        case "Decímetro (dm)":
                            return (QuantMedidaInicial * 10000);

                        case "Centímetro (cm)":
                            return (QuantMedidaInicial * 100000);

                        case "Milímetro (mm)":
                            return (QuantMedidaInicial * 1000000);

                    }

                case "Hectômetro (hm)":
                    switch (MedidaFinal) {
                        case "Quilômetro (km)":
                            return (QuantMedidaInicial / 10);
                        case "Hectômetro (hm)":

                            return QuantMedidaInicial;

                        case "Decâmetro (dam)":
                            return (QuantMedidaInicial * 10);

                        case "metro (m)":
                            return (QuantMedidaInicial * 100);

                        case "Decímetro (dm)":
                            return (QuantMedidaInicial * 1000);

                        case "Centímetro (cm)":
                            return (QuantMedidaInicial * 10000);

                        case "Milímetro (mm)":
                            return (QuantMedidaInicial * 100000);

                    }

                case "Decâmetro (dam)":
                    switch (MedidaFinal) {
                        case "Quilômetro (km)":
                            return (QuantMedidaInicial / 100);
                        case "Hectômetro (hm)":

                            return (QuantMedidaInicial / 10);

                        case "Decâmetro (dam)":
                            return QuantMedidaInicial;

                        case "metro (m)":
                            return (QuantMedidaInicial * 10);

                        case "Decímetro (dm)":
                            return (QuantMedidaInicial * 100);

                        case "Centímetro (cm)":
                            return (QuantMedidaInicial * 1000);

                        case "Milímetro (mm)":
                            return (QuantMedidaInicial * 10000);

                    }

                case "metro (m)":
                    switch (MedidaFinal) {
                        case "Quilômetro (km)":
                            return (QuantMedidaInicial / 1000);
                        case "Hectômetro (hm)":

                            return (QuantMedidaInicial / 100);

                        case "Decâmetro (dam)":
                            return (QuantMedidaInicial / 10);

                        case "metro (m)":
                            return QuantMedidaInicial;

                        case "Decímetro (dm)":
                            return (QuantMedidaInicial * 10);

                        case "Centímetro (cm)":
                            return (QuantMedidaInicial * 100);

                        case "Milímetro (mm)":
                            return (QuantMedidaInicial * 1000);

                    }

                case "Decímetro (dm)":
                    switch (MedidaFinal) {
                        case "Quilômetro (km)":
                            return (QuantMedidaInicial / 10000);
                        case "Hectômetro (hm)":

                            return (QuantMedidaInicial / 1000);

                        case "Decâmetro (dam)":
                            return (QuantMedidaInicial / 100);

                        case "metro (m)":
                            return (QuantMedidaInicial / 10);

                        case "Decímetro (dm)":
                            return QuantMedidaInicial;

                        case "Centímetro (cm)":
                            return (QuantMedidaInicial * 10);

                        case "Milímetro (mm)":
                            return (QuantMedidaInicial * 100);

                    }

                case "Centímetro (cm)":
                    switch (MedidaFinal) {
                        case "Quilômetro (km)":
                            return (QuantMedidaInicial / 100000);
                        case "Hectômetro (hm)":

                            return (QuantMedidaInicial / 10000);

                        case "Decâmetro (dam)":
                            return (QuantMedidaInicial / 1000);

                        case "metro (m)":
                            return (QuantMedidaInicial / 100);

                        case "Decímetro (dm)":
                            return (QuantMedidaInicial / 10);

                        case "Centímetro (cm)":
                            return QuantMedidaInicial;

                        case "Milímetro (mm)":
                            return (QuantMedidaInicial * 10);

                    }

                case "Milímetro (mm)":
                    switch (MedidaFinal) {
                        case "Quilômetro (km)":
                            return (QuantMedidaInicial / 100000);
                        case "Hectômetro (hm)":

                            return (QuantMedidaInicial / 10000);

                        case "Decâmetro (dam)":
                            return (QuantMedidaInicial / 10000);

                        case "metro (m)":
                            return (QuantMedidaInicial / 1000);

                        case "Decímetro (dm)":
                            return (QuantMedidaInicial / 100);

                        case "Centímetro (cm)":
                            return (QuantMedidaInicial / 10);

                        case "Milímetro (mm)":
                            return QuantMedidaInicial;

                    }

            }
        }
        return 0;
    }
}
