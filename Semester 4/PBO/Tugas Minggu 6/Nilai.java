class Method {
    float nilai;
    String nilaiHuruf;
    String predikat;

    String getNilaiHuruf(float nilai){
        if (nilai >= 85) {
            nilaiHuruf = "A";
        } else if (nilai >= 70 && nilai <= 84){
            nilaiHuruf = "B";
        } else if (nilai >= 60 && nilai <= 69){
            nilaiHuruf = "C";
        } else if (nilai >= 40 && nilai <= 59){
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        } return nilaiHuruf;
    }

    String getPredikat (String nilaiHuruf){
        if (nilaiHuruf == "A") {
            predikat = "Apik";
        } else if(nilaiHuruf == "B"){
            predikat = "Bagus";
        } else if(nilaiHuruf == "C"){
            predikat = "Cukup";
        } else if(nilaiHuruf == "D"){
            predikat = "Dablek";
        } else{
            predikat = "Elek";
        } return predikat;
    }
}

public class Nilai {
    public static void main(String[] args) {
        Method method = new Method();

        System.out.print("Nilai      ");
        System.out.print("Nilai Huruf     ");
        System.out.println("Predikat");

        System.out.print("85 - 100        ");
        System.out.print(method.getNilaiHuruf(85)+ "             ");
        System.out.println(method.getPredikat("A"));

        System.out.print("70 - 84         ");
        System.out.print(method.getNilaiHuruf(75)+ "             ");
        System.out.println(method.getPredikat("B"));

        System.out.print("60 - 69         ");
        System.out.print(method.getNilaiHuruf(69)+ "             ");
        System.out.println(method.getPredikat("C"));

        System.out.print("40 - 59         ");
        System.out.print(method.getNilaiHuruf(45)+ "             ");
        System.out.println(method.getPredikat("D"));

        System.out.print("0 - 39          ");
        System.out.print(method.getNilaiHuruf(10)+ "             ");
        System.out.println(method.getPredikat("E"));
    }    
}

