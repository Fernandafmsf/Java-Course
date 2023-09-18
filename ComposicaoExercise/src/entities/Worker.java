package entities;

import enumeracao.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    //composicoes
    private Department department; //cada trabalhador so pode ter um departamento
    //cada item da lista vai ser um objeto hourContract
    private List<HourContract> contracts = new ArrayList<>(); //como há a possibilidade de ter mais de um contrato por trabalhador, cria se uma lista para comportar a quantiadade.
    // Tambem ja devemos efetuar a instanciacao da lista. E ela nao deve estar no construtor

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public String getName() {
        return name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //para adicionar e remover contratos devemos sempre fazer dessa forma e nao com setContract, pois do jeito do setContract, estariamso criando uma nova lista
    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }
}
