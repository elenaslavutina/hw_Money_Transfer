public class Main {

    public static void main(String[] args)
	{
        int balansenow = 2_000_000_000;
        int transaction = 5_000_000;
        // predel - предельное число транзакций, больше которых произойдет переполение разряда int
        int predel = (2_147_483_647 - balansenow) / transaction;
        int result1 = balansenow + (predel ) * transaction;
		System.out.println("Результат для предельного количества транзакций =  " + predel);
		System.out.println(result1);
	    // при числе транзакций, на единицу больше предельной ошибка
        int result2 = balansenow + (predel + 1) * transaction;
        System.out.println("Результат, если количество транзакций больше предельной");
		System.out.println(result2);
    }
}
