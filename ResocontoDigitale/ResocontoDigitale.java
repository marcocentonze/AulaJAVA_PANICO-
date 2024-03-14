class ResocontoDigitale {
    public void stampaResoconto(Smartphone smartphone, Tablet tablet) {
        System.out.println("Ecco il resoconto Digitale:");
        System.out.println("Il tuo nome è: " + smartphone.getNome());
        System.out.println("La tua password è:" + smartphone.getPassword());
        System.out.println("Hai" + tablet.getPunti() + "punti");
        System.out.println("Il tuo id è:" + tablet.getId());
    }
}

