/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.tsunami.workflow;

import com.google.tsunami.common.ErrorCode;
import com.google.tsunami.common.TsunamiException;

/** Signals a well known and recognized error occurred while executing the scanning workflow. */
public class ScanningWorkflowException extends TsunamiException {
  public ScanningWorkflowException(String message) {
    super(ErrorCode.WORKFLOW_ERROR, message);
  }
}
