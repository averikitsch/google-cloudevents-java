|- AuthEventData(uid: STRING, email: STRING, email_verified: BOOL, display_name: STRING, photo_URL: STRING, disabled: BOOL, metadata: UserMetadata, provider_data: List<UserInfo>, phone_number: STRING, custom_claims: Struct)
|- UserMetadata(create_time: Timestamp, last_sign_in_time: Timestamp)
|- UserInfo(uid: STRING, email: STRING, display_name: STRING, photo_URL: STRING, provider_id: STRING)
