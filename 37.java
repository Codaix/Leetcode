class Spreadsheet {
    private int[][] grid;
    private int rows;

    public Spreadsheet(int rows) {
        this.rows = rows;
        this.grid = new int[rows][26]; // 26 columns
    }

    public void setCell(String cell, int value) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = value;
    }

    public void resetCell(String cell) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = 0;
    }

    public int getValue(String formula) {
        formula = formula.substring(1); // remove '='
        String[] parts = formula.split("\\+");
        return eval(parts[0]) + eval(parts[1]); // ✅ FIX
    }

    private int eval(String token) {
        if (Character.isLetter(token.charAt(0))) { // cell reference
            int[] pos = parseCell(token);
            return grid[pos[0]][pos[1]];
        } else { // number
            return Integer.parseInt(token);
        }
    }

    private int[] parseCell(String cell) {
        char colChar = cell.charAt(0);
        int col = colChar - 'A';
        int row = Integer.parseInt(cell.substring(1)) - 1;
        return new int[]{row, col};
    }
}
