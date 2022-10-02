
//create the strings, floats, and int need
class SU2022_MortgageAccount_Perry {
    private String account_number;
    private String last_name;
    private String first_name;
    private float principal;
    private int num_of_payments;
    private float interest_rate;
    private float monthly_payment;

    public SU2022_MortgageAccount_Perry() {

    }

    public SU2022_MortgageAccount_Perry(String account_number, String last_name, String first_name, float principal,
            int num_of_payments, float interest_rate) {
        this.account_number = account_number;
        this.last_name = last_name;
        this.first_name = first_name;
        this.principal = principal;
        this.num_of_payments = num_of_payments;
        this.interest_rate = interest_rate;
        calculateMonthlyPayment();
    }

    public String getAccount_number() {
        return account_number;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public float getPrincipal() {
        return principal;
    }

    public int getNum_of_payments() {
        return num_of_payments;
    }

    public float getInterest_rate() {
        return interest_rate;
    }

    public float getMonthly_payment() {
        return monthly_payment;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setPrincipal(float principal) {
        this.principal = principal;
    }

    public void setNum_of_payments(int num_of_payments) {
        this.num_of_payments = num_of_payments;
    }

    public void setInterest_rate(float interest_rate) {
        this.interest_rate = interest_rate;
    }

    public void setMonthly_payment(float monthly_payment) {
        this.monthly_payment = monthly_payment;
    }

    @Override
    public String toString() {
        return "SU2022_MortgageAccount_Perry [account_number=" + account_number + ", last_name=" + last_name
                + ", first_name="
                + first_name + ", principal=" + principal + ", num_of_payments=" + num_of_payments + ", interest_rate="
                + interest_rate + ", monthly_payment=" + monthly_payment + "]";
    }

    void calculateMonthlyPayment() {
        monthly_payment = (float) ((principal * Math.pow(1 + interest_rate / 12, num_of_payments) * interest_rate / 12)
                / (Math.pow(1 + interest_rate / 12, num_of_payments) - 1));
    }

    SU2022_MortgageAccount_Perry openAccount(String account_number, String last_name, String first_name,
            float principal,
            int num_of_payments, float interest_rate) {
        SU2022_MortgageAccount_Perry new_obj = new SU2022_MortgageAccount_Perry(account_number, last_name, first_name,
                principal, num_of_payments, interest_rate);
        return new_obj;
    }

    float processPayment(float amt) {
        principal = principal - amt;
        return principal;
    }

}