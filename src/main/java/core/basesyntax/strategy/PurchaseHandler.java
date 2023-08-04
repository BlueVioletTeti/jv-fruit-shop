package core.basesyntax.strategy;

import core.basesyntax.service.StorageService;
import core.basesyntax.service.implementation.StorageServiceImpl;

public class PurchaseHandler implements FruitShopOperationsHandler {
    private StorageService storageService;

    public PurchaseHandler() {
        storageService = new StorageServiceImpl();
    }

    @Override
    public void applyOperation(String product, int quantity) {
        storageService.remove(product, quantity);
    }
}
