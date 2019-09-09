package com.veda.app.blooddonation.data.source.local;

import com.veda.app.blooddonation.data.model.ReceiverDonorRequestType;
import com.veda.app.blooddonation.data.model.User;
import com.veda.app.blooddonation.data.source.DonationDataSource;

/**
 * Created by riteshksingh on Apr, 2018
 */
public class DonationLocalDataSource implements DonationDataSource {

    private static DonationLocalDataSource INSTANCE;

    private DonationLocalDataSource() {
    }

    public static DonationDataSource getInstance() {
        if (INSTANCE == null) {
            synchronized (DonationLocalDataSource.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DonationLocalDataSource();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void saveNewUser(String userId, User user) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public void saveReceiverDetails(String userId, ReceiverDonorRequestType receiverDonorRequestType) {

    }

    @Override
    public void saveDonorDetails(String userId, ReceiverDonorRequestType receiverDonorRequestType) {

    }
}
