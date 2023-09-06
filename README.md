# Liga-BetPlay-Fem
Liga Betplay Fem
```java public class Figuras {

    public static void main(String[] args) {
        Scanner vari = new Scanner(System.in);
        int opcion;

        // Se muestra un menú y se solicita al usuario que elija una opción.
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Triangulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Imprimir");
            System.out.println("5. Salir");
            System.out.print("Digite opción: ");
            opcion = vari.nextInt();

            // Se ejecuta la acción correspondiente según la opción elegida.
            switch (opcion) {
                case 1:
                    calcularTriangulo();
                    break;
                case 2:
                    calcularCuadrado();
                    break;
                case 3:
                    calcularRectangulo();
                    break;
                case 4:
                    imprimir();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println(); // Salto de línea para separar cada iteración del menú
        } while (opcion != 5);

    }

    /**
     * Método que calcula el área y el perímetro de un triángulo.
     */
    public static void calcularTriangulo() {
        Scanner scanner = new Scanner(System.in);

        // Se solicita al usuario que ingrese la base del triángulo.
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        // Se solicita al usuario que ingrese la altura del triángulo.
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        // Se calcula el área y el perímetro del triángulo.
        double area = (base * altura) / 2;
        double perimetro = base * 3;

        // Se muestra el resultado del cálculo.
        System.out.println("El área del triángulo es: " + area);
        System.out.println("El perímetro del triángulo es: " + perimetro);

    }

    /**
     * Método que calcula el área y el perímetro de un cuadrado.
     */
    public static void calcularCuadrado() {
        Scanner scanner = new Scanner(System.in);

        // Se solicita al usuario que ingrese el lado del cuadrado.
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        // Se calcula el área y el perímetro del cuadrado.
        double area = lado * lado;
        double perimetro = lado * 4;

        // Se muestra el resultado del cálculo.
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);


    }

    /**
     * Método que calcula el área y el perímetro de un rectángulo.
     */
    public static void calcularRectangulo() {
        Scanner scanner = new Scanner(System.in);

        // Se solicita al usuario que ingrese el ancho del rectángulo.
        System.out.print("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();

        // Se solicita al usuario que ingrese el largo del rectángulo.
        System.out.print("Ingrese el largo del rectángulo: ");
        double largo = scanner.nextDouble();

        // Se calcula el área y el perímetro del rectángulo.
        double area = ancho * largo;
        double perimetro = 2 * (ancho + largo);

        // Se muestra el resultado del cálculo.
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

    }

    /**
     * Método que imprime un mensaje de prueba.
     */
    public static void imprimir() {
        System.out.println("Imprimiendo...");
    }
}


```
