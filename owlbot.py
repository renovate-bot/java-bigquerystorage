# Copyright 2021 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

import synthtool as s
from synthtool.languages import java


for library in s.get_staging_dirs():
    # put any special-case replacements here
    s.move(library)

s.remove_staging_dirs()
java.common_templates(
    excludes=[
        "renovate.json",
        ".kokoro/build.sh",
        ".kokoro/nightly/retry_non_quota.cfg",
        ".kokoro/nightly/retry_quota.cfg",
        ".kokoro/nightly/samples.cfg",
        ".kokoro/presubmit/samples.cfg",
        ".kokoro/presubmit/graalvm-native-17.cfg",
        ".kokoro/presubmit/graalvm-native.cfg",
        ".kokoro/presubmit/graalvm-native-a.cfg",
        ".kokoro/presubmit/graalvm-native-b.cfg",
        ".kokoro/presubmit/graalvm-native-c.cfg",
        ".kokoro/dependencies.sh",
        ".github/workflows/approve-readme.yaml",
        ".github/workflows/auto-release.yaml",
        ".github/workflows/ci.yaml",
        ".github/workflows/samples.yaml"
        ".kokoro/requirements.in",
        ".kokoro/requirements.txt"
    ]
)
