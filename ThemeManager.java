class ThemeManager {
    private Theme theme;

    // Constructor
    public ThemeManager(Theme theme) {
        this.theme = theme;
    }

    // Toggle theme
    public void toggleTheme() {
        theme.setDarkMode(!theme.isDarkMode());
        System.out.println("Theme toggled successfully!");
    }

    // Apply theme (simulate UI update)
    public void applyTheme() {
        if (theme.isDarkMode()) {
            System.out.println("Applying Dark Theme to UI...");
        } else {
            System.out.println("Applying Light Theme to UI...");
        }
    }

    // Save preference (simulated)
    public void savePreference() {
        System.out.println("Theme preference saved.");
    }
}
