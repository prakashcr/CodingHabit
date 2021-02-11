package Javacodes;


interface wrestler {
    public void paymentForWork(int hours);

    public void themeMusic();

    public void finisher();
}

class StoneCold implements wrestler {
    public static void main(String args[]) {
        StoneCold sc = new StoneCold();
        sc.paymentForWork(5);
        sc.finisher();
        sc.themeMusic();

    }

    @Override
    public void paymentForWork(int hours) {
        System.out.println("Stone cold will make $" + hours * 300.00);
    }

    @Override
    public void themeMusic() {
        System.out.println("Stone cold's music playing...");
    }

    @Override
    public void finisher() {
        System.out.println("Stone cold's finishing stunner...");
    }
}