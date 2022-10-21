package com.stussy.stussyclone20220930hs.dto.validation;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

@GroupSequence({validationGroups.NotBlankGroup.class,
        validationGroups.SizeGroup.class,
        validationGroups.PatternCheckGroup.class,
        Default.class
})
public interface ValidationSequence {
}
