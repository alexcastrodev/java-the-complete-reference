public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        // 1) A referência é a variável (ref1). O objeto é o "new" no heap.
        //    ref1 aponta para o objeto com name="Original"
        Person ref1 = new Person("Original");

        // 2) Atribuir uma referência a outra NÃO copia o objeto.
        //    ref2 aponta para o MESMO objeto que ref1.
        Person ref2 = ref1;

        System.out.println(ref1.name); // Original
        System.out.println(ref2.name); // Original

        // 3) Alterando via ref2, ref1 enxerga a mudança — é o mesmo objeto.
        ref2.name = "Modificado";

        System.out.println(ref1.name); // Modificado
        System.out.println(ref2.name); // Modificado

        // 4) Reatribuir ref1 NÃO afeta ref2. Só a referência muda.
        ref1 = new Person("Novo objeto");

        System.out.println(ref1.name); // Novo objeto
        System.out.println(ref2.name); // Modificado  (ainda aponta pro objeto antigo)

        // 5) Passando referência para um método:
        //    O método recebe uma CÓPIA da referência, não o objeto.
        changePerson(ref2);
        System.out.println(ref2.name); // Modificado  (reatribuição dentro do método não afeta aqui)

        changeName(ref2);
        System.out.println(ref2.name); // Alterado pelo método  (o objeto FOI modificado)

        // 6) Garbage collection: quando nenhuma referência aponta pro objeto,
        //    ele fica elegível para o GC.
        ref1 = null;
        ref2 = null;
        // Agora os objetos no heap ficam elegíveis para garbage collection.
    }

    static void changePerson(Person ref) {
        // ref é uma cópia da referência — reatribuir não afeta o chamador
        ref = new Person("Dentro do método");
    }

    static void changeName(Person ref) {
        // ref aponta pro mesmo objeto — modificar o objeto afeta o chamador
        ref.name = "Alterado pelo método";
    }
}