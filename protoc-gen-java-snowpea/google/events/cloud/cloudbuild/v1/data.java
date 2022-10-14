|- BuildEventData(id: STRING, project_id: STRING, status: ENUM, status_detail: STRING, source: Source, steps: List<BuildStep>, results: Results, create_time: Timestamp, start_time: Timestamp, finish_time: Timestamp, timeout: Duration, images: List<STRING>, queue_ttl: Duration, artifacts: Artifacts, logs_bucket: STRING, source_provenance: SourceProvenance, build_trigger_id: STRING, options: BuildOptions, log_url: STRING, substitutions: List<SubstitutionsEntry>, tags: List<STRING>, secrets: List<Secret>, timing: List<TimingEntry>)
   |- SubstitutionsEntry(key: STRING, value: STRING)
      |- TimingEntry(key: STRING, value: TimeSpan)
   |- Source(storage_source: StorageSource, repo_source: RepoSource)
|- StorageSource(bucket: STRING, object: STRING, generation: INT64)
|- RepoSource(project_id: STRING, repo_name: STRING, branch_name: STRING, tag_name: STRING, commit_sha: STRING, dir: STRING, invert_regex: BOOL, substitutions: List<SubstitutionsEntry>)
   |- SubstitutionsEntry(key: STRING, value: STRING)
   |- BuildStep(name: STRING, env: List<STRING>, args: List<STRING>, dir: STRING, id: STRING, wait_for: List<STRING>, entrypoint: STRING, secret_env: List<STRING>, volumes: List<Volume>, timing: TimeSpan, pull_timing: TimeSpan, timeout: Duration, status: ENUM)
|- Volume(name: STRING, path: STRING)
|- Results(images: List<BuiltImage>, build_step_images: List<STRING>, artifact_manifest: STRING, num_artifacts: INT64, build_step_outputs: List<BYTES>, artifact_timing: TimeSpan)
|- BuiltImage(name: STRING, digest: STRING, push_timing: TimeSpan)
|- Artifacts(images: List<STRING>, objects: ArtifactObjects)
   |- ArtifactObjects(location: STRING, paths: List<STRING>, timing: TimeSpan)
   |- TimeSpan(start_time: Timestamp, end_time: Timestamp)
|- SourceProvenance(resolved_storage_source: StorageSource, resolved_repo_source: RepoSource, file_hashes: List<FileHashesEntry>)
   |- FileHashesEntry(key: STRING, value: FileHashes)
   |- FileHashes(file_hash: List<Hash>)
|- Hash(type: ENUM, value: BYTES)
|- Secret(kms_key_name: STRING, secret_env: List<SecretEnvEntry>)
   |- SecretEnvEntry(key: STRING, value: BYTES)
   |- BuildOptions(source_provenance_hash: List<ENUM>, requested_verify_option: ENUM, machine_type: ENUM, disk_size_gb: INT64, substitution_option: ENUM, log_streaming_option: ENUM, worker_pool: STRING, logging: ENUM, env: List<STRING>, secret_env: List<STRING>, volumes: List<Volume>)
