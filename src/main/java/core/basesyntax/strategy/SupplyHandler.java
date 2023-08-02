package core.basesyntax.strategy;

import core.basesyntax.service.implementation.StorageServiceImpl;

public class SupplyHandler implements FruitShopOperationsHandler {
    @Override
    public void applyOperation(String product, int quantity) {
        supply(product, quantity);
    }

    private void supply(String product, int quantity) {
        StorageServiceImpl storageService = new StorageServiceImpl();
        storageService.add(product, quantity);
    }
}
