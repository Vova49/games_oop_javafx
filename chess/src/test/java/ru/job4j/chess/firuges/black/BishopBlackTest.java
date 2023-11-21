package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        assertEquals(Cell.C1, bishop.position());
    }

    @Test
    public void testCopy() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        BishopBlack copiedBishop = (BishopBlack) bishop.copy(Cell.D2);
        assertEquals(Cell.D2, copiedBishop.position());
    }

    @Test
    public void testIsDiagonal() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        assertTrue(bishop.isDiagonal(Cell.C1, Cell.E3));
        assertFalse(bishop.isDiagonal(Cell.C1, Cell.E1));
        assertFalse(bishop.isDiagonal(Cell.C1, Cell.C3));
    }
}