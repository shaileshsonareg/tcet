interface DBConn {
    public void select(String sql); //select is abstract method w/o definition
    public static void foo() {
        System.out.println("I am from foo");
    } 
}

class Oracle implements DBConn {

    public void select(String sql) {}
}

class Main {
    public static void main(String[] args) {
        DBConn.foo();
        // Oracle oracle_obj = new Oracle();
        // oracle_obj.select("SELECT * FROM employee");
    }
}

