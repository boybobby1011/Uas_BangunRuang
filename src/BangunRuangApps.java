public class BangunRuangApps {
    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang();

        bangunRuang.setPanjang(10);
        bangunRuang.setLebar(5);
        bangunRuang.setTinggi(8);
        bangunRuang.setDiameter(14);

        System.out.println("Luas Permukaan Balok: " + bangunRuang.luasBalok());
        System.out.println("Volume Balok: " + bangunRuang.volumeBalok());
        System.out.println("Luas Permukaan Bola: " + bangunRuang.luasBola());
        System.out.println("Volume Bola: " + bangunRuang.volumeBola());
    }
}
