package br.pro.hashi.ensino.desagil.aula5;

public class Politician {
    private boolean corrupt;
    private String name;
    private double salary;
    private int networking;

    public Politician(boolean corrupt, String name, double salary) {
        this.corrupt = corrupt;
        this.name = name;
        this.salary = salary;
        this.networking = 0;
    }

    public String getName() {
        return name;
    }

    public int getNetworking() {
        return networking;
    }

    public void setNetworking(int networking) {
        this.networking = networking;
    }

    public double getIncome() {
        double factor = 1.0 + 0.1 * networking;
        if (corrupt) {
            return 2 * factor * salary;
        }
        return factor * salary;
    }

    public void salute(Object object) {
        if (object instanceof Politician) {
            Politician politician = (Politician) object;
            if (corrupt) {
                System.out.println("Honrado em encontrá-lo, Vossa Excelência " + politician.getName() + ", como posso ajudar?");
            } else {
                System.out.println("Olá, " + politician.getName() + ", tudo bem?");
            }
        } else {
            Citizen citizen = (Citizen) object;
            if (corrupt) {
                System.out.println("Saudações, senhor " + citizen.getName() + ", tenha um ótimo dia!");
            } else {
                System.out.println("E aí, " + citizen.getName() + ", firmeza?");
            }
        }
    }
}
