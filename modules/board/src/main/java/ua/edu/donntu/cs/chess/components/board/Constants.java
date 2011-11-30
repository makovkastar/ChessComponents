/*
 * Constants.java
 */

package ua.edu.donntu.cs.chess.components.board;

import java.util.ResourceBundle;

/**
 * Description.
 *
 * @author Rod Odin
 */
public interface Constants
	extends ua.edu.donntu.cs.chess.components.generic.Constants
{
	public static final ResourceBundle BOARD_BUNDLE = ResourceBundle.getBundle(Constants.class.getPackage().getName() + ".board");

	public static final String WHITE_KING_IMAGE_PATH = BOARD_BUNDLE.getString("piece.white.king");
	public static final String BLACK_KING_IMAGE_PATH = BOARD_BUNDLE.getString("piece.black.king");
	public static final String WHITE_QUEEN_IMAGE_PATH = BOARD_BUNDLE.getString("piece.white.queen");
	public static final String BLACK_QUEEN_IMAGE_PATH = BOARD_BUNDLE.getString("piece.black.queen");
	public static final String WHITE_ROOK_IMAGE_PATH = BOARD_BUNDLE.getString("piece.white.rook");
	public static final String BLACK_ROOK_IMAGE_PATH = BOARD_BUNDLE.getString("piece.black.rook");
	public static final String WHITE_BISHOP_IMAGE_PATH = BOARD_BUNDLE.getString("piece.white.bishop");
	public static final String BLACK_BISHOP_IMAGE_PATH = BOARD_BUNDLE.getString("piece.black.bishop");
	public static final String WHITE_KNIGHT_IMAGE_PATH = BOARD_BUNDLE.getString("piece.white.knight");
	public static final String BLACK_KNIGHT_IMAGE_PATH = BOARD_BUNDLE.getString("piece.black.knight");
	public static final String WHITE_PAWN_IMAGE_PATH = BOARD_BUNDLE.getString("piece.white.pawn");
	public static final String BLACK_PAWN_IMAGE_PATH = BOARD_BUNDLE.getString("piece.black.pawn");
}
