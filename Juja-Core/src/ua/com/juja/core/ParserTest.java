package ua.com.juja.core;

/**
 * Created by DM on 20.09.2016.
 */

//      Задание: переписать его, что бы он ВМЕСТО пункта 2 дела пункт 2′
//      2′) встретив XXX-знак-число – сведил задачу к анализу XXX. (пример:”(10-3)*1″ -> “(10-3)”, пример “(2/(9+1))+3″ -> “(2/(9+1)”);
//        Предупреждение #1: это не полноценный парсер арифметических выражений, есть множество корректных выражений на которых он “падает” или вычисляет некорректно (“(1+1)+(1+1)”, “-1″, …).
//      Предупреждение #2: в условиях лабораторной ожидается, что старые выражения вида число-знак-XXX больше на разбираются.

public class ParserTest {
    public static void main(String[] args) {
        /*System.out.println ( "2*3".substring ( 2, 3 ) );*/
        System.out.println ( ">> 123 = " + Parser.eval ( "123" ) );
        System.out.println ( ">> 2*3 = " + Parser.eval ( "2*3" ) );
        System.out.println ( ">> (1+3)*2 = " + Parser.eval ( "(1+3)*2" ) );
        System.out.println ( ">> ((13/6)*2-5)+1 = " + Parser.eval ( "((13/6)*2-5)+1" ) );
    }
}
