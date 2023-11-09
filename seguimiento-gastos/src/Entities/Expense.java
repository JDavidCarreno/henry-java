package Entities;

public class Expense {
    private static Integer id_counter = 0;
    private Integer id;
    private Double amount;
    private ExpenseCategory category;
    private String date;

    public Expense() {
        this.id = id_counter;
        id_counter++;
    }

    public Expense(Double amount, ExpenseCategory category, String date) {
        this.id = id_counter;
        this.amount = amount;
        this.category = category;
        this.date = date;
        id_counter++;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public ExpenseCategory getCategory() {
        return category;
    }

    public void setCategory(ExpenseCategory category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", amount=" + amount +
                ", category=" + category +
                ", date='" + date + '\'' +
                '}';
    }
}
