class BangunDatar {
    public float luas(){
        return 0;
    }

    public float keliling(){
        return 0;
    }
}

class Persegi extends BangunDatar {
    float sisi;

    public void setSisi(float sisi){
        this.sisi = sisi;
    }

    @Override
    public float luas(){
        return sisi*sisi;
    }

    @Override
    public float keliling(){
        return 4*sisi;
    }
}

class Lingkaran extends BangunDatar {
    float r;

    public void setR(float r){
        this.r = r;
    }

    @Override
    public float luas(){
        return (float)3.14 * r * r;
    }

    @Override
    public float keliling(){
        return 2 * (float) 3.14 * r;
    }
}

class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    public void setPanjang(float panjang){
        this.panjang = panjang;
    }

    public void setLebar(float lebar){
        this.lebar = lebar;
    }

    @Override
    public float luas(){
        return panjang * lebar;
    }

    @Override
    public float keliling(){
        return 2 * (panjang + lebar);
    }
}

class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    public void setAlas(float alas){
        this.alas = alas;
    }

    public void settinggi(float tinggi){
        this.tinggi = tinggi;
    }

    public float luas(){
        return (float) 0.5 * alas * tinggi;
    }

    public float keliling(){
        return alas + alas + alas;
    }
}

