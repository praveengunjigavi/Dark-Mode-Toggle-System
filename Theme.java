class Theme {
    private boolean isDarkMode;

    // Constructor
    public Theme(boolean isDarkMode) {
        this.isDarkMode = isDarkMode;
    }

    // Getter
    public boolean isDarkMode() {
        return isDarkMode;
    }

    // Setter
    public void setDarkMode(boolean isDarkMode) {
        this.isDarkMode = isDarkMode;
    }

    // Display current theme
    public void displayTheme() {
        if (isDarkMode) {
            System.out.println("🌙 Dark Mode Enabled");
        } else {
            System.out.println("☀️ Light Mode Enabled");
        }
    }
}
