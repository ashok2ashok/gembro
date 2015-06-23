package info.lequocanh.gembro.service.user;

import info.lequocanh.gembro.domain.user.CurrentUser;
import info.lequocanh.gembro.domain.user.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by quocanh on 23/06/15.
 */
@Service
public class CurrentUserServiceImpl implements CurrentUserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CurrentUserDetailsService.class);

    @Override
    public boolean canAccessUser(CurrentUser currentUser, Long userId) {
        LOGGER.debug("Checking if user={} has access to user={}", currentUser, userId);
        return currentUser != null
                && (currentUser.getRole() == Role.ADMIN || currentUser.getId().equals(userId));
    }
}
