tabLayout.addOnTabSelectedListener(
        new TabLayout.OnTabSelectedListener() {

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

        if (tab.getPosition() == 0) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container,
                            new HomeFragment())
                    .commit();

        } else if (tab.getPosition() == 1) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container,
                            new SearchFragment())
                    .commit();
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
    }
});
