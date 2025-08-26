
import React, { Suspense } from 'react'
import { getQueryClient, trpc } from './api/trpc/server';
import { dehydrate, HydrationBoundary } from '@tanstack/react-query';
import { Client } from './client';

const page = () => {
 
  const queryClient = getQueryClient();
  void queryClient.prefetchQuery(trpc.createAI.queryOptions({text : "king billu"}));
  return (
    <HydrationBoundary state={dehydrate(queryClient)}>
      <Suspense fallback= {<p>Loading...</p>}>
     <Client />
     </Suspense>
    </HydrationBoundary>
  );
}

export default page