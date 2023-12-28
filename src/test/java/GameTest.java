import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void testStrengthPlayer() {
        Player max = new Player(1, "Макс", 50);
        Player gleb = new Player(2, "Глеб", 100);
        Game game = new Game();
        game.register(max );
        game.register(gleb );
        int actual = game.round("Макс", "Глеб") ;
        int expected = 2;

        Assertions.assertEquals(expected ,actual ) ;
    }
    @Test
    public void testStrengthPlayer2() {
        Player max = new Player(1, "Макс", 150);
        Player gleb = new Player(2, "Глеб", 100);
        Game game = new Game();
        game.register(max );
        game.register(gleb );
        int actual = game.round("Макс", "Глеб") ;
        int expected = 1;

        Assertions.assertEquals(expected ,actual ) ;
    }
    @Test
    public void testStrengthPlayer3() {
        Player max = new Player(1, "Макс", 150);
        Player gleb = new Player(2, "Глеб", 150);
        Game game = new Game();
        game.register(max );
        game.register(gleb );
        int actual = game.round("Макс", "Глеб") ;
        int expected = 0;

        Assertions.assertEquals(expected ,actual ) ;
    }
    @Test
    public void testStrengthPlayer4() {
        Player max = new Player(1, "Макс", 150);
        Player gleb = new Player(2, "Глеб", 150);
        Game game = new Game();
        game.register(max );
        game.register(gleb );


        Assertions.assertThrows(NotRegisteredException.class ,
                ()->game.round("Иван", "Макс")
        ) ;
    }
    @Test
    public void testStrengthPlayer5() {
        Player max = new Player(1, "Макс", 150);
        Player gleb = new Player(2, "Глеб", 150);
        Game game = new Game();
        game.register(max );
        game.register(gleb );


        Assertions.assertThrows(NotRegisteredException.class ,
                ()->game.round("Макс","Иван")
        ) ;
    }
}
