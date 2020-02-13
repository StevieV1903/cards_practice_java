import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.KING);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuitType());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.KING, card.getRankType());
    }

}
